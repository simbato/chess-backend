package com.pmf.chess.model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovePieceRequest {
    private int originRow;
    private int originCol;
    private int destinationRow;
    private int destinationCol;


}
