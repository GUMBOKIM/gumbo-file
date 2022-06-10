package kr.gumbo.file.entity

import kr.gumbo.file.dto.CreateFileDto
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.Where
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Where(clause = "isDeleted = false")
class File(createFileDto: CreateFileDto) : BaseTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    var originFileName: String = createFileDto.originFileName;

    @Column(nullable = false)
    var fileSize: Long = createFileDto.fileSize;

    @Column(nullable = false)
    var fileExtension: String = createFileDto.fileExtension;

    @Column(nullable = false)
    var fileLocation: String = createFileDto.fileLocation;

    @Column(nullable = false)
    var saveFileName: String = createFileDto.saveFileName;

    var isDeleted: Boolean = false;

    var createdUserId: Long? = null;

    var deletedUserId: Long? = null;

    fun deleteFile(userId: Long?) {
        this.isDeleted = true
        this.deletedUserId = userId;
    }
}