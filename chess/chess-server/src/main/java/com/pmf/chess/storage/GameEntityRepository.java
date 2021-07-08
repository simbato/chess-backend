package com.pmf.chess.storage;

import org.springframework.data.repository.CrudRepository;


public interface GameEntityRepository extends CrudRepository<GameEntity, String> {
}
