package com.procurement.system.construction.industry.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TokenId;

    @NotNull
    private String token;

    private boolean expired = false;

    private boolean revoked = false;

    @OneToOne
    @JoinColumn(name = "user_id_ref")
    private User user;
}
