package ru.netology.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Movie {
    private int id;
    private String name;
    private String movieGenre;
    private boolean premiereTomorrow;

}
