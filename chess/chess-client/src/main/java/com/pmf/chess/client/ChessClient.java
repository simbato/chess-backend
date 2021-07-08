package com.pmf.chess.client;

import com.pmf.chess.model.api.*;
import lombok.NonNull;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ChessClient {
    private RestTemplate client;

    public ChessClient(String serviceURL, RestTemplateBuilder restTemplateBuilder){
        client = restTemplateBuilder.rootUri(serviceURL + "/api").build();
    }

    public ResponseEntity<CreateGameResponse> createGame(@NonNull CreateGameRequest request){
        HttpEntity<CreateGameRequest> requestHttpEntity = new HttpEntity<>(request);
        return client.exchange("/create", HttpMethod.POST, requestHttpEntity, CreateGameResponse.class);
    }
    public ResponseEntity<JoinGameResponse> joinGame(@NonNull JoinGameRequest request){
        HttpEntity<JoinGameRequest> requestHttpEntity = new HttpEntity<>(request);
        return client.exchange("/join", HttpMethod.POST, requestHttpEntity, JoinGameResponse.class);
    }
    public ResponseEntity<MovePieceResponse> joinGame(@NonNull MovePieceRequest request){
        HttpEntity<MovePieceRequest> requestHttpEntity = new HttpEntity<>(request);
        return client.exchange("/move", HttpMethod.POST, requestHttpEntity, MovePieceResponse.class);
    }
    public ResponseEntity<GetChessBoardResponse> joinGame(@NonNull GetChessBoardRequest request){
        HttpEntity<GetChessBoardRequest> requestHttpEntity = new HttpEntity<>(request);
        return client.exchange("/chessBoard", HttpMethod.POST, requestHttpEntity, GetChessBoardResponse.class);
    }
}
