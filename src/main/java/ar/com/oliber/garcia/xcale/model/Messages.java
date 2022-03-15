package ar.com.oliber.garcia.xcale.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String text;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "from_id")
    private Contacts from;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "groups_id")
    private Groups groups;
}
