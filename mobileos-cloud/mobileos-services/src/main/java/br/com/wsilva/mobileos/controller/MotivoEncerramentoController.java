package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.MotivoEncerramentoEntity;
import br.com.wsilva.mobileos.repository.MotivoEncerramentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class MotivoEncerramentoController {
    @Autowired
    private MotivoEncerramentoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<MotivoEncerramentoEntity> findAll() {
        return (List<MotivoEncerramentoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MotivoEncerramentoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public MotivoEncerramentoEntity save(@RequestBody MotivoEncerramentoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MotivoEncerramentoEntity update(@RequestBody MotivoEncerramentoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}