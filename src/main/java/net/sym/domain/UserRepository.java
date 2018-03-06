package net.sym.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserId(String userId); // userid로도 데이터 조회 가능하게 해줌
}
