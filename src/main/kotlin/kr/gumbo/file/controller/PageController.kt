package kr.gumbo.file.controller;

import kr.gumbo.file.dto.CreateFileDto
import kr.gumbo.file.entity.File
import kr.gumbo.file.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Autowired
    lateinit var fileService: FileService;

    @GetMapping("/hello")
    fun sayHello():ResponseEntity<String> {
        return ResponseEntity.ok("Hello Spring");
    }

    @GetMapping("/test")
    fun testController(@RequestBody createFileDto: CreateFileDto): ResponseEntity<MutableList<File>> {
        return ResponseEntity.ok(fileService.createFile(createFileDto));
    }

    @GetMapping("/test2")
    fun testController(@RequestBody fileId: Long): ResponseEntity<MutableList<File>> {
        return ResponseEntity.ok(fileService.updateFile(fileId));
    }
}
