import { ClienteModel } from './../model/cliente-model';
import { ClienteRepository } from './../repository/cliente-repository';
import { Component, OnInit, ViewChild } from '@angular/core';
import { Table } from 'primeng/table/table';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Title } from '@angular/platform-browser';

@Component({
  selector: 'app-cliente-table',
  templateUrl: './cliente-table.component.html',
  styleUrls: ['./cliente-table.component.css']
})
export class ClienteTableComponent implements OnInit {

  clientes: ClienteModel[] = [];
  loading: boolean;
  @ViewChild('dt') table: Table;
  @ViewChild('dt2') table2: Table;
  constructor(
    private repository: ClienteRepository,
    private confirmarService: ConfirmationService,
    private messageService: MessageService,
    private title: Title) { }

  ngOnInit() {    
    this.loading = true;
    this.carregarClientes();  
  }  

  carregarClientes(){
    this.title.setTitle('Lista de clientes');
    this.clientes = [];
    this.repository.getAllClientes().then(resposta => {
      this.clientes = resposta;
      this.loading = false;         
    });  
  }

  excluir(id: number){
    this.confirmarService.confirm({
      message: 'Tem certeza que deseja excluir este cliente?',
      accept: () => {
        this.repository.deleteCliente(id).subscribe( resposta => {
          this.messageService.add(
            {
              key: 'toast',
              severity: 'success',
              summary: 'CLIENTE',
              detail: 'excluído com sucesso!'
            });   
            this.carregarClientes();
        });    
      }
  });
  }
 
}
