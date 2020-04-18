package fr.CIM.restEndPointForTicketDataSet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.CIM.restEndPointForTicketDataSet.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
