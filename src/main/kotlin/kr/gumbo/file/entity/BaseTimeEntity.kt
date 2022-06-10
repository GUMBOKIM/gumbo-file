package kr.gumbo.file.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@EntityListeners(AuditingEntityListener::class)
@MappedSuperclass
class BaseTimeEntity(
    @CreatedDate
    @Column(updatable = false)
    var createdDate: LocalDateTime = LocalDateTime.MIN,
    @LastModifiedDate
    var updateDate: LocalDateTime = LocalDateTime.MIN
)