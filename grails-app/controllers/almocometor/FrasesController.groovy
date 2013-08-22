package almocometor

class FrasesController {

    static scaffold = true

    def index() {

        redirect(action: 'fraseAleatoria')
    }


    def fraseAleatoria() {

        def todasAsFrases = Frases.list()
        def frase

        if (todasAsFrases.size() > 0) {
            def indexAleatorio = new Random().nextInt(todasAsFrases.size())
            frase = todasAsFrases[indexAleatorio]
        } else {
            def staticFrase = "Água mole pedra dura.. :D"
            def staticAutor = "Anônimo"
            frase = new Frases(frase: staticFrase, autor: staticAutor)
        }
        [minhaFrase: frase]
    }

    def home() {
        render("<h1>Minhas frases</h1>")
    }

}
