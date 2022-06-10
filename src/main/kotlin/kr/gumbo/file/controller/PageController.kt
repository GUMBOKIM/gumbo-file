package kr.gumbo.file.controller;

import kr.gumbo.file.dto.CreateFileDto
import kr.gumbo.file.entity.File
import kr.gumbo.file.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RequestMapping("/api")
@RestController
public class PageController {

    @Autowired
    lateinit var fileService: FileService;

    @GetMapping("/home")
    fun home(): ResponseEntity<String> {
        return ResponseEntity.ok("Welcome to FileServer");
    }

    @PostMapping("/upload")
    fun uploadFile(file: MultipartFile): ResponseEntity<Any> {
        fileService.uploadFile(file);
        return ResponseEntity.ok("AA");
    }

    @DeleteMapping("/delete")
    fun deleteFile(fileId: Long) : ResponseEntity<Any> {
        return ResponseEntity.ok("ASDASD");
    }

}
