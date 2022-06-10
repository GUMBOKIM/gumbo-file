package kr.gumbo.file.service

import kr.gumbo.file.repository.FileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class FileService {

    @Autowired
    private lateinit var fileRepository: FileRepository;

    val filePath = "D:\\file\\";

    fun uploadFile(domain: String, userId: Long, file: MultipartFile) {
        val contentType = file.contentType;
        println("fileRepository = ${fileRepository}");
    }

//    fun createFile(file: MultipartFile): File {
//        println("file = ${file}")
//        val createFileDto = CreateFileDto();
//
//        return
//    }

    fun uploadFile(file: MultipartFile){
        println("file = ${file}")
    }

}