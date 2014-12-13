package com.wordnik.swagger.codegen

object BapiDocGenerator extends BapiDocGenerator {
  def main(args: Array[String]) = generateClient(args)
}

class BapiDocGenerator extends SwaggerDocGenerator {

  override def templateDir = "src/main/resources/bapi-static"
  override def destinationDir = "docs/bapi/"

  override def supportingFiles = List(
    ("assets/images/logo.png", destinationDir + "/assets/images", "logo.png"),
    ("assets/css/custom.css", destinationDir + "/assets/css", "custom.css"),
    ("index.mustache", destinationDir, "index.html")
  )
}
