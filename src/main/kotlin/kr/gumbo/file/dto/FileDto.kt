package kr.gumbo.file.dto

data class CreateFileDto(
    val domain: String,
    val originFileName: String,
    val saveFileName: String,
    val fileExtension: String,
    val fileLocation: String
)