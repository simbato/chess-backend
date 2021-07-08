package com.pmf.chess.model.api;

import com.pmf.chess.model.data.ChessBoard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetChessBoardResponse {
    private ChessBoard board;
}
