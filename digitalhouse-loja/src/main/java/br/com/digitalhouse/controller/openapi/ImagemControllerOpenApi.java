package br.com.digitalhouse.controller.openapi;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import br.com.digitalhouse.dto.ImagemDTO;
import br.com.digitalhouse.exception.config.Problem;
import br.com.digitalhouse.request.ImagemRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Api(tags = "Controller de Imagem")
public interface ImagemControllerOpenApi {
	
	@ApiOperation("Cadastrar uma foto")
	@ApiResponses({ @ApiResponse(code = 201, message = "Foto cadastrada", response = ImagemDTO.class) })	
	ImagemDTO salvarFoto(@Valid ImagemRequest imagem);
	
	@ApiOperation(value = "Buscar todos os Clientes resumido", httpMethod = "GET")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Buscar todos os clientes resumido", response = ImagemDTO.class) })
	 List<ImagemDTO> listar();
	
	
	
	@ApiOperation(value = "Excluir Foto pelo ID", httpMethod = "DELETE", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 204, message = "Foto excluída com sucesso", response = ImagemDTO.class),
			@ApiResponse(code = 404, message = "O recurso não foi encontrado", response = Problem.class) })
	@ApiImplicitParam(name = "id", value = "Id a ser excluído", required = true, dataType = "int", paramType = "path", example = "1")
	ResponseEntity<ImagemDTO> excluir (Long id);
	

}