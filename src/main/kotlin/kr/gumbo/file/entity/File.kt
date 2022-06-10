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
@SQLDelete(sql = "UPDATE file SET isDeleted=1 WHERE id = ?")
class File(
    createFileDto: CreateFileDto
) : BaseTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    open var domain: String = createFileDto.domain;

    @Column(nullable = false)
    var fileLocation: String = createFileDto.fileLocation;

    @Column(nullable = false)
    var originFileName: String = createFileDto.originFileName;

    var isDeleted: Boolean = false;

    @Column(nullable = false)
    var saveFileName: String = createFileDto.saveFileName;

    @Column(nullable = false)
    var fileExtension: String = createFileDto.fileExtension;

//    var createdUser: Long? = null;
//    var updatedUser: Long? = null;

    fun deleteFile() {
        this.isDeleted = true
    }
}