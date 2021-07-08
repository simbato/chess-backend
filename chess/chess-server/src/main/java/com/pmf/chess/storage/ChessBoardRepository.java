package com.pmf.chess.storage;

import org.springframework.data.repository.CrudRepository;

public interface ChessBoardRepository extends CrudRepository<ChessBoardEntity, String> {
}
