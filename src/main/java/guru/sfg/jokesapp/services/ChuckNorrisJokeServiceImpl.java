package guru.sfg.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements JokeService {


    @Override
    public String getJoke() {
        ChuckNorrisQuotes ck = new ChuckNorrisQuotes();
        return ck.getRandomQuote();
    }
}
