package net.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.app.entity.User;

public interface UserRepo extends JpaRepository<User,String> {

}
