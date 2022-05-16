package domain

import domain.criterios.CriterioDeAprovacao
import domain.Boletim
import domain.BoletimFechado

class AnalisadorDeAprovacao {
    
    private val criterio: CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao): Void {
        this.criterio = criterio
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        val mediaFinal = this.criterio.mediaFinal(boletim)
        val estaAprovado = this.criterio.estaAprovado(boletim)

        return BoletimFechado(boletim.mediaEps, boletim.mediaMiniEPs, mediaFinal, estaAprovado)
    }

}