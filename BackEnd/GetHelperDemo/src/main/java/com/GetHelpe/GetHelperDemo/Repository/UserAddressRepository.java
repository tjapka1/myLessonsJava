package com.GetHelpe.GetHelperDemo.Repository;

import com.GetHelpe.GetHelperDemo.Entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends JpaRepository <UserAddress, Long> {
}
