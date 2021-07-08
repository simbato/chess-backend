package com.pmf.chess.model.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChessBoard {
    private List<List<FieldType>> fields;

    public enum FieldType{
        EMPTY, PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING;
    }


}
