package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.StateRepository;
import com.fleetapp.fleetapp.models.State;
import com.fleetapp.fleetapp.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    //RETURN LIST OF States//////
    public List<State> getstates() {
        return stateRepository.findAll();
    }

    public void saveState(State state) {
        stateRepository.save(state);
    }

    //get by Id//////
    public Optional<State> getById(int id) {
        return stateRepository.findById(id);
    }

    ///////DELETE State//////////
    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }

}
