/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author User
 */
public enum Color {
    TRANSPARENT("прозрачный"),
    WHITE("белый"),
    GREY("серый"),
    BLACK("черный"),
    RED("красный"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    PINK("розовый"),
    PURPLE("фиолетовый"),
    BLUE("синий"),
    PALEBLUE("голубой"),
    ORANGE("оранжевый"),
    BROWN("коричневый");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}
