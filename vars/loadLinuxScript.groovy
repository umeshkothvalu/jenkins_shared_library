def call (Map config = [:]) {
def scriptcontent = libraryResource "$/scripts/linux/${config.name}"
writeFile file: "${config.name}" , text: scriptcontent
sh "chmod a+x ./${config.name}"

}
