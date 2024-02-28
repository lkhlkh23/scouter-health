package scouter.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scouter.health.infra.user.UserMainEntity;

public interface UserMainEntityRepository extends JpaRepository<UserMainEntity, String> {
}
