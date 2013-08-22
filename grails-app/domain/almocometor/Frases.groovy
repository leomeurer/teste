package almocometor

class Frases {

    String frase
    String autor

    Date dateCreated
    Date lastUpdated

    static constraints = {
        frase nullable: false, blank: false, maxSize: 1000
        autor nullable: true, blank:true
    }
}
