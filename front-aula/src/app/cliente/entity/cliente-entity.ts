export interface ClienteEntity {
    id?: number;
    nome?: string;
    sobrenome?: string;
    telefones?: any[];
    dataNasc?: string;
    cpf?: string;
    rg?: string;
    email?: string;
    endereco?: EnderecoEntity;
    foto?: ImagemEntity;
}

export interface ImagemEntity {
    id?: number,
    nomeArquivo?: string,
    nomeArquivoCompleto?: string,
    contentType?: string,
    tamanho?: number,
    url?: string
}

export interface EnderecoEntity {
    cep?: string;
    logradouro?: string;
    numero?: string;
    complemento?: string;
    bairro?: string;
    cidade?: CidadeEntity;
}

export interface CidadeEntity {
    id?: number;
    nome?: string;
    estado?: EstadoEntity;
}

export interface EstadoEntity {
    id?: number;
    nome?: string;
}
