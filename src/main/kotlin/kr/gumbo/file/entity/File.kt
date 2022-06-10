package kr.gumbo.file.entity

import kr.gumbo.file.dto.CreateFileDto
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class File(
    createFileDto: CreateFileDto
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    open var domain: String = createFileDto.domain;

    @Column(nullable = false)
    var fileLocation: String = createFileDto.fileLocation;

    @Column(nullable = false)
    var originFileName: String = createFileDto.originFileName;

    @Column(nullable = false)
    var saveFileName: String = createFileDto.saveFileName;

    @Column(nullable = false)
    var fileExtension: String = createFileDto.fileExtension;

//    var createdUser: Long? = null;
//    var createdAt: LocalDateTime = null;
//    var updatedUser: Long? = null;
//    var updateAt: LocalDateTime = null;
}