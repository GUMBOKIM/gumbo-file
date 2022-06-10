package kr.gumbo.file.dto

data class CreateFileDto(
    val originFileName: String,
    val fileSize: Long,
    val fileExtension: String,
    val saveFileName: String,
    val fileLocation: String
)