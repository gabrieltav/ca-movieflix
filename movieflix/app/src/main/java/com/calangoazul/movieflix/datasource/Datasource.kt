package com.calangoazul.movieflix.datasource

import com.calangoazul.movieflix.model.Movie

class Datasource {

    companion object {
        fun getMovies() : ArrayList<Movie> {
            var movies = ArrayList<Movie>()
            movies.add(Movie(1, "Retorno do Rei", "O olho inimigo está se movendo", 2013, "O confronto final entre as forças do bem e do mal que lutam pelo controle do futuro da Terra Média se aproxima", 5, "Ação"))
            movies.add(Movie(2, "Bob Esponja", "O Incrível Resgate", 2020, "Onde está Gary? Segundo Bob Esponja, Gary foi \"caracolstrado\" pelo temível Rei Poseidon e levado para a cidade perdida de Atlantic City. Junto a Patrick Estrela, ele sai em uma missão de resgate ao querido amigo, e nesta jornada os dois vão conhecer novos personagens e viver inimagináveis aventuras", 5, "comédia"))
            movies.add(Movie(3, "O Orfanato", " ", 2017, "Laura (Belén Rueda) passou os anos mais felizes de sua vida em um orfanato, onde recebeu os cuidados de uma equipe e de outros companheiros órfãos, a quem considerava como se fossem seus irmãos e irmãs verdadeiros. Agora, 30 anos depois, ela retornou ao local com seu marido Carlos (Fernando Cayo) e seu filho Simón (Roger Príncep), de 7 anos. Ela deseja restaurar e reabrir o orfanato, que está abandonado há vários anos. O local logo desperta a imaginação de Simón, que passa a criar contos fantásticos. Entretanto à medida que os contos ficam mais estranhos Laura começa a desconfiar que há algo à espreita na casa.", 5, "Terror"))
            movies.add(Movie(4, "O Labirinto do Fauno", "", 2007, "Em 1944, na Espanha, a jovem Ofélia e sua mãe doente chegam ao posto do novo marido de sua mãe, um sádico oficial do exército que está tentando reprimir uma guerrilheira. Enquanto explorava um labirinto antigo, Ofélia encontra o Pan fauno, que diz que a menina é uma lendária princesa perdida e que ela precisa completar três tarefas perigosas a fim de se tornar imortal", 4, "Drama"))
            return movies
        }
    }
}