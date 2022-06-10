package kr.gumbo.file.repository

import kr.gumbo.file.entity.File
import org.springframework.data.jpa.repository.JpaRepository

interface FileRepository: JpaRepository<File, Long> {
}