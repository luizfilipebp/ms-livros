package br.com.fiap.infrastructure.config;


import br.com.fiap.application.gateway.*;
import br.com.fiap.application.usecaseimpl.*;
import br.com.fiap.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LivroConfig {
    @Bean
    CadastrarLivroUseCase cadastrarLivroUseCase(CadastrarLivroGateway cadastrarLivroGateway) {
        return new CadastrarLivroUseCaseImpl(cadastrarLivroGateway);
    }

    @Bean
    EditarLivroUseCase editarLivroUseCase(EditarLivroGateway editarLivroGateway) {
        return new EditarLivroUseCaseImpl(editarLivroGateway);
    }

    @Bean
    ExcluirLivroUseCase excluirLivroUseCase(ExcluirLivroGateway excluirLivroGateway) {
        return new ExcluirLivroUseCaseImpl(excluirLivroGateway);
    }

    @Bean
    PesquisarLivroPeloIsbnUseCase pesquisarLivroPeloIsbnUseCase(PesquisarLivroPeloIsbnGateway gateway) {
        return new PesquisarLivroPeloIsbnUseCaseImpl(gateway);
    }

    @Bean
    PesquisarLivroPeloAutorUseCase pesquisarLivroPeloAutorUseCase(PesquisarLivroPeloAutorGateway gateway) {
        return new PesquisarLivroPeloAutorUseCaseImpl(gateway);
    }
}
