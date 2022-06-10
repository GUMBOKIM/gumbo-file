package kr.gumbo.file.entity

import kr.gumbo.file.dto.CreateFileDto
import kr.gumbo.file.entity.enum.DomainState
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
class Domain(name: String, domain: String): BaseTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    var name: String = name;

    var domain: String = domain;

    @Enumerated(EnumType.STRING)
    var state: DomainState = DomainState.CREATED;

    var currentVolume: Long = 0;

    var maxVolume: Long = 0;

    fun addCurrentVolume(volume: Long) {
        this.currentVolume += volume;
    }

    fun uploadAvailable(volume: Long): Boolean {
        return (this.currentVolume + volume) < this.maxVolume
    }

}