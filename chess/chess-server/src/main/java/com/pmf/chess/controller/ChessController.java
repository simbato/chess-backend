package com.pmf.chess.controller;


import com.pmf.chess.model.api.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ChessController {

    @PostMapping("/create")
    public ResponseEntity<CreateGameResponse>  createGame(@RequestBody CreateGameRequest request){

        return ResponseEntity.ok(CreateGameResponse.builder().build());
    }

    @PostMapping("/join")
    public ResponseEntity<JoinGameResponse> joinGame(@RequestBody JoinGameRequest request){

        return ResponseEntity.ok(JoinGameResponse.builder().build());
    }

    @PostMapping("/move")
    public ResponseEntity<MovePieceResponse> movePiece(@RequestBody MovePieceRequest request){

        return ResponseEntity.ok(MovePieceResponse.builder().build());
    }

    @PostMapping("/chessBoard")
    public ResponseEntity<GetChessBoardResponse> getChessBoard(@RequestBody GetChessBoardRequest request){

        return ResponseEntity.ok(GetChessBoardResponse.builder().build());
    }


}
