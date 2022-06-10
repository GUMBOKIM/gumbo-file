package kr.gumbo.file.service

import kr.gumbo.file.dto.CreateFileDto
import kr.gumbo.file.entity.File
import kr.gumbo.file.repository.FileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FileService {

    @Autowired
    private lateinit var fileRepository: FileRepository;

    fun createFile(createFileDto: CreateFileDto): MutableList<File> {
        fileRepository.save(File(createFileDto));
        return fileRepository.findAll();
    }

    fun updateFile(fileId: Long): MutableList<File> {
        val file = fileRepository.findById(fileId).get();
        file.deleteFile();
        fileRepository.save(file);
        return fileRepository.findAll();
    }
}