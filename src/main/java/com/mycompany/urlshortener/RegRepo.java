/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.urlshortener;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sikhu
 */
public interface RegRepo extends JpaRepository<Registration, Integer> {

    Optional<Registration> findFirstnameByEmail(String Email);

    Optional<Registration> findFirstnameByEmailAndPassword(String Email, String Password);

}
