/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1poo;

/**
 *
 * @author xmpz
 */
class MyBook extends Book {

    @Override
    void setTitle(String s) {
        super.title = s;
    }
    
    String getTitle() {
        return "El título es: " + super.title + ".";
    }
    
}
