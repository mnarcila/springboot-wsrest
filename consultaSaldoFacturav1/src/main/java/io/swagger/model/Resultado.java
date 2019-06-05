package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Resultado
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T00:01:55.157-05:00")

public class Resultado   {
  private Double valorRespuesta = null;

  private String mensaje = null;

  public Resultado valorRespuesta(Double valorRespuesta) {
    this.valorRespuesta = valorRespuesta;
    return this;
  }

   /**
   * Get valorRespuesta
   * @return valorRespuesta
  **/
  @ApiModelProperty(value = "")
  public Double getValorRespuesta() {
    return valorRespuesta;
  }

  public void setValorRespuesta(Double valorRespuesta) {
    this.valorRespuesta = valorRespuesta;
  }

  public Resultado mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

   /**
   * Get mensaje
   * @return mensaje
  **/
  @ApiModelProperty(value = "")
  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resultado resultado = (Resultado) o;
    return Objects.equals(this.valorRespuesta, resultado.valorRespuesta) &&
        Objects.equals(this.mensaje, resultado.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorRespuesta, mensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resultado {\n");
    
    sb.append("    valorRespuesta: ").append(toIndentedString(valorRespuesta)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

