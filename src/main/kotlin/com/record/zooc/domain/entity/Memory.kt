import com.record.zooc.domain.entity.BaseTimeEntityModified
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.Table

@DiscriminatorColumn(name = "mission_type")
@Entity
@Table(name = "memory")
@Inheritance(strategy = InheritanceType.JOINED)
class Memory(
    image: String,
    content: String,
) : BaseTimeEntityModified() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        protected set

    @Column
    var image: String = image
        protected set

    @Column
    var content: String = content
        protected set
}