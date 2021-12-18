/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Retro3.Retro3.interfaces;

import Retro3.Retro3.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JOHNM
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    
}
