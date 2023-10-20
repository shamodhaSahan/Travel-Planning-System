package lk.ijse.tps.tps.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 10/12/2023
 * Time : 12:10 AM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String customerId;
    private String name;
    private String email;
    private String nic;
    private String address;

    @Lob
    @Column(nullable = false,columnDefinition = "LONGTEXT")
    private String profile;

    private String userName;
    private String password;
}