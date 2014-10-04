use java_practica1
drop database java2014
Create database  java2014;

use java2014

-- -----------------------------------------------------
-- Table cliente
-- -----------------------------------------------------
IF OBJECT_ID('cliente', 'U') IS NOT NULL
DROP TABLE cliente;


CREATE TABLE  cliente (
  id_cliente	INT NOT NULL,
  TipoCliente	INT NULL,
  Direccion		VARCHAR(45) NULL,
  Telefono		VARCHAR(45) NULL,
  Apellido		VARCHAR(45) NULL,
  DNI			VARCHAR(45) NULL,
  ID_Direccion	VARCHAR(45) NULL,
  RazonSocial	VARCHAR(45) NULL,
  Responsable	VARCHAR(45) NULL,
  DeudaMaxima	VARCHAR(45) NULL,
  Autorizacion	VARCHAR(45) NULL,
  FechaHora		DATETIME NULL,
  PRIMARY KEY (id_cliente))


  

-- -----------------------------------------------------
-- Table Deposito
-- -----------------------------------------------------
IF OBJECT_ID('Deposito', 'U') IS NOT NULL
DROP TABLE  Deposito;
  

CREATE TABLE  Deposito (
  id_Deposito INT NOT NULL,
  Descripcion VARCHAR(45) NULL,
  PRIMARY KEY (id_Deposito))


IF OBJECT_ID('Sucursal', 'U') IS NOT NULL
DROP TABLE Sucursal;
 

CREATE TABLE  Sucursal (
  id_Sucursal	 INT NOT NULL,
  NombreSucursal VARCHAR(45) NULL,
  Provincia		 VARCHAR(45) NULL,
  CP			 VARCHAR(45) NULL,
  Telefono		 VARCHAR(45) NULL,
  ID_Deposito	 INT NULL,
  PRIMARY KEY (id_Sucursal),
  FOREIGN KEY (id_deposito) REFERENCES Deposito (id_Deposito))  

-- -----------------------------------------------------
-- Table Sector
-- -----------------------------------------------------
IF OBJECT_ID('Sector', 'U') IS NOT NULL
DROP TABLE Sector;
  

CREATE TABLE  Sector (
  id_Sector		INT NOT NULL,
  id_deposito	INT NOT NULL,
  Descripcion	VARCHAR(45) NULL,
  ndola			INT NULL,
  Numero		INT NULL,
  CondicionesEspeciales VARCHAR(45) NULL,
  PRIMARY KEY (id_Sector, id_deposito),
  FOREIGN KEY (id_deposito) REFERENCES Deposito (id_Deposito))
  


-- -----------------------------------------------------
-- Table Manifiesto
-- -----------------------------------------------------
IF OBJECT_ID('Manifiesto', 'U') IS NOT NULL
DROP TABLE Manifiesto;
 

CREATE TABLE  Manifiesto (
  id_Manifiesto INT NOT NULL,
  Descripcion	VARCHAR(45) NULL,
  PRIMARY KEY (id_Manifiesto));
 

/*-- -----------------------------------------------------
-- Table ItemRemito
-- -----------------------------------------------------
IF OBJECT_ID('ItemRemito', 'U') IS NOT NULL
DROP TABLE ItemRemito;
 

CREATE TABLE  ItemRemito (
  Id_Item	INT NOT NULL,
  Id_Remito INT NULL,
  PRIMARY KEY (Id_Item))
  */

-- -----------------------------------------------------
-- Table Remito
-- -----------------------------------------------------
IF OBJECT_ID('Remito', 'U') IS NOT NULL
DROP TABLE Remito;
  

CREATE TABLE  Remito (
  Id_Remito		INT NOT NULL,
  --id_Manifiesto INT NOT NULL,
  id_SucOrigen	INT NULL,
  id_SucDestino	INT NULL,
  FechaEntrega	DATETIME NULL,
  FechaMaxima	DATETIME NULL,
  CondicionesEspeciales VARCHAR(400) NULL,
  PRIMARY KEY (Id_Remito),
 -- FOREIGN KEY (id_Manifiesto)   REFERENCES Manifiesto (id_Manifiesto),
  FOREIGN KEY (id_SucDestino)   REFERENCES sucursal (id_Sucursal),
  FOREIGN KEY (id_SucOrigen)    REFERENCES sucursal (id_Sucursal))
   
/*-- -----------------------------------------------------
-- Table Item
-- -----------------------------------------------------
DROP TABLE Item;
  

CREATE TABLE  Item (
  Paquete VARCHAR(45) NULL,
  Id_Item INT NOT NULL,
  PRIMARY KEY (Id_Item),
  CONSTRAINT fk_Item_ItemRemito1
    FOREIGN KEY (Id_Item)
    REFERENCES ItemRemito (Id_Item)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  */


-- -----------------------------------------------------
-- Table PlanDeMantenimiento
-- -----------------------------------------------------
IF OBJECT_ID('PlanDeMantenimiento', 'U') IS NOT NULL
DROP TABLE PlanDeMantenimiento;
  

CREATE TABLE  PlanDeMantenimiento (
  id_PlanDeMantenimiento INT NOT NULL,
  Apto					 INT NULL,
  descripcion			 VARCHAR(45) NULL,
  PRIMARY KEY (id_PlanDeMantenimiento))
  


-- -----------------------------------------------------
-- Table Vehiculo
-- -----------------------------------------------------
IF OBJECT_ID('Vehiculo', 'U') IS NOT NULL
DROP TABLE Vehiculo;
 

CREATE TABLE  Vehiculo (
  id_Vehiculo			 INT NOT NULL,
  tipo					 VARCHAR(45) NULL,
  id_PlanDeMantenimiento INT not NULL,
  VolumenTransportado	 FLOAT NULL,
  peso					 FLOAT NULL,
  tara					 FLOAT NULL,
  CondicionesEspeciales  VARCHAR(45) NULL,
  Patente				 VARCHAR(45) NULL,
  Kilometraje			 VARCHAR(45) NULL,
  PRIMARY KEY (id_Vehiculo),
  FOREIGN KEY (id_PlanDeMantenimiento)  REFERENCES PlanDeMantenimiento (id_PlanDeMantenimiento))
  

-- -----------------------------------------------------
-- Table Tracking
-- -----------------------------------------------------
IF OBJECT_ID('Tracking', 'U') IS NOT NULL
DROP TABLE Tracking;
 

CREATE TABLE  Tracking (
  id_Tracking	INT NOT NULL,
  Id_Remito		INT NOT NULL,
  id_Manifiesto	INT NOT NULL,
  id_vehiculo	INT NOT NULL,
  PRIMARY KEY (id_Tracking, Id_Remito, id_Manifiesto),
  CONSTRAINT fk_Tracking_Remito1
    FOREIGN KEY (Id_Remito , id_Manifiesto)  REFERENCES Remito (Id_Remito , id_Manifiesto ),
	FOREIGN KEY (id_vehiculo)  REFERENCES Vehiculo (id_vehiculo))
  

-- -----------------------------------------------------
-- Table Destinatario
-- -----------------------------------------------------
IF OBJECT_ID('Destinatario', 'U') IS NOT NULL
DROP TABLE Destinatario;
 

CREATE TABLE  Destinatario (
  id_Destinatario	INT NOT NULL,
  DNI				VARCHAR(45) NULL,
  Nombre			VARCHAR(45) NULL,
  Apellido			VARCHAR(45) NULL,
  Direccion			VARCHAR(400) NULL,
  PRIMARY KEY (id_Destinatario))
  


-- -----------------------------------------------------
-- Table Recibo
-- -----------------------------------------------------
IF OBJECT_ID('Recibo', 'U') IS NOT NULL
DROP TABLE Recibo;
 

CREATE TABLE  Recibo (
  ID_Recibo		INT NOT NULL,
  ID_Cliente	INT not NULL,
  id_itemRecibo int not null,
  Cantidad		INT NULL,
  Importe		Float NULL,
  PRIMARY KEY (ID_Recibo),
  FOREIGN KEY (ID_Cliente)		REFERENCES Cliente (ID_Cliente))

-- -----------------------------------------------------
-- Table Paquete
-- -----------------------------------------------------
IF OBJECT_ID('Paquete', 'U') IS NOT NULL
DROP TABLE Paquete;
 

CREATE TABLE  Paquete (
  id_Paquete			INT NOT NULL,
  NroPaqute				INT NULL,
  Clase 				VARCHAR(45) NULL,
  TipoCarga				VARCHAR(45) NULL,
  Alto					INT NULL,
  Lar					INT NULL,
  Ancho					INT NULL,
  Peso					FLOAT NULL,
  Volumen				FLOAT NULL,
  Id_Tipo_Tratamiento	INT NULL,
  ID_Tipo_Fragilidad	INT NULL,
  Apilable				INT NULL,
  ApilableCantidad		INT NULL,
  FechaEntrega			DATETIME NULL,
  CoordenadaGps			INT NULL,
  Id_remito				INT not NULL,
  id_Manifiesto			int not null,
  id_recibo				int not null,
  Refrigerada			VARCHAR(45) NULL,
  Manipulacion			VARCHAR(45) NULL,
  Estado				VARCHAR(45) NULL,
  Observaciones			VARCHAR(45) NULL,
  PRIMARY KEY (id_Paquete),
  FOREIGN KEY (id_Recibo)		REFERENCES Recibo (id_Recibo),
  FOREIGN KEY (Id_Remito)		REFERENCES Remito (Id_Remito),
  FOREIGN KEY (id_Manifiesto)   REFERENCES Manifiesto (id_Manifiesto))



-- -----------------------------------------------------
-- Table Fragilidad
-- -----------------------------------------------------
IF OBJECT_ID('Fragilidad', 'U') IS NOT NULL
DROP TABLE Fragilidad;
  

CREATE TABLE  Fragilidad (
  id_Paquete	INT NOT NULL,
  Descripcion	VARCHAR(45) NULL,
  PRIMARY KEY (id_Paquete),
  CONSTRAINT fk_Fragilidad_Paquete1
    FOREIGN KEY (id_Paquete)    REFERENCES Paquete (id_Paquete))
  


-- -----------------------------------------------------
-- Table Tratamiento
-- -----------------------------------------------------
IF OBJECT_ID('Tratamiento', 'U') IS NOT NULL
DROP TABLE Tratamiento;
  

CREATE TABLE  Tratamiento (
  Id_Paquete	INT NOT NULL,
  Descripcion	VARCHAR(45) NULL,
  PRIMARY KEY (Id_Paquete),
  CONSTRAINT fk_Tratamiento_Paquete1
    FOREIGN KEY (Id_Paquete)    REFERENCES Paquete (id_Paquete))
  


  


/*-- -----------------------------------------------------
-- Table ItemRecibo
-- -----------------------------------------------------
DROP TABLE ItemRecibo;
  

CREATE TABLE  ItemRecibo (
  Id_ItemRecibo	INT NOT NULL,
  Id_Recibo		INT NOT NULL,
  id_Paquete	INT NOT NULL,
  PRIMARY KEY (Id_ItemRecibo),
  FOREIGN KEY (Id_Recibo) REFERENCES Recibo (Id_Recibo),
  FOREIGN KEY (id_Paquete) REFERENCES Paquete (id_Paquete))
  */


-- -----------------------------------------------------
-- Table PaqueCliente
-- -----------------------------------------------------
IF OBJECT_ID('PaqueCliente', 'U') IS NOT NULL
DROP TABLE PaqueCliente;
  

CREATE TABLE  PaqueCliente (
  id_Paquete	INT NOT NULL,
  id_cliente	INT NOT NULL,
  PRIMARY KEY (id_Paquete, id_cliente),
  CONSTRAINT fk_Paquete_has_cliente_Paquete1
    FOREIGN KEY (id_Paquete)    REFERENCES Paquete (id_Paquete),
  CONSTRAINT fk_Paquete_has_cliente_cliente1
    FOREIGN KEY (id_cliente)	REFERENCES cliente (id_cliente))
  


-- -----------------------------------------------------
-- Table Area
-- -----------------------------------------------------
IF OBJECT_ID('Area', 'U') IS NOT NULL
DROP TABLE Area;
  

CREATE TABLE  Area (
  id_Area	  INT NOT NULL,
  Descripcion VARCHAR(45) NULL,
  PRIMARY KEY (id_Area))
  


-- -----------------------------------------------------
-- Table Empleado
-- -----------------------------------------------------
IF OBJECT_ID('Empleado', 'U') IS NOT NULL
DROP TABLE Empleado;
 

CREATE TABLE  Empleado (
  id_Empleado	INT NOT NULL,
  id_Area		INT NOT NULL,
  Nombre		VARCHAR(45) NULL,
  Apellido		VARCHAR(45) NULL,
  NroEmpleado	INT NULL,
  Car			VARCHAR(45) NULL,
  PRIMARY KEY (id_Empleado, id_Area),
  CONSTRAINT fk_Empleado_Area1
    FOREIGN KEY (id_Area)  REFERENCES Area (id_Area))
  


-- -----------------------------------------------------
-- Table Sucursal_has_Empleado
-- -----------------------------------------------------
IF OBJECT_ID('Sucursal_has_Empleado', 'U') IS NOT NULL
DROP TABLE Sucursal_has_Empleado;
  

CREATE TABLE  Sucursal_has_Empleado (
  Sucursal_id_Sucursal	INT NOT NULL,
  Empleado_id_Empleado	INT NOT NULL,
  Empleado_id_Area		INT NOT NULL,
  PRIMARY KEY (Sucursal_id_Sucursal, Empleado_id_Empleado, Empleado_id_Area),
  CONSTRAINT fk_Sucursal_has_Empleado_Sucursal1
    FOREIGN KEY (Sucursal_id_Sucursal)					  REFERENCES Sucursal (id_Sucursal),
  CONSTRAINT fk_Sucursal_has_Empleado_Empleado1
    FOREIGN KEY (Empleado_id_Empleado , Empleado_id_Area) REFERENCES Empleado (id_Empleado , id_Area))

-- -----------------------------------------------------
-- Table VehiculoSubcontratado
-- -----------------------------------------------------
IF OBJECT_ID('VehiculoSubcontratado', 'U') IS NOT NULL
DROP TABLE VehiculoSubcontratado;
  

CREATE TABLE  VehiculoSubcontratado (
  id_VehiculoSubcontratado	INT NOT NULL,
  patente					VARCHAR(45) NULL,
  volumen					FLOAT NULL,
  peso						FLOAT NULL,
  tipo						VARCHAR(45) NULL,
  PRIMARY KEY (id_VehiculoSubcontratado))  

  
-- -----------------------------------------------------
-- Table EmpresaSubcontratada
-- -----------------------------------------------------
IF OBJECT_ID('EmpresaSubcontratada', 'U') IS NOT NULL
DROP TABLE EmpresaSubcontratada;
  

CREATE TABLE  EmpresaSubcontratada (
  id_EmpresaSubcontratada INT NOT NULL,
  RazonSocial	VARCHAR(45) NULL,
  CUIT			VARCHAR(15) NULL,
  Tipo			VARCHAR(45) NULL,
  Id_VehiculoSubcontratado INT NOT NULL,
  PRIMARY KEY (id_EmpresaSubcontratada),
  FOREIGN KEY (Id_VehiculoSubcontratado) REFERENCES VehiculoSubcontratado (Id_VehiculoSubcontratado))
  
  


-- -----------------------------------------------------
-- Table Envio
-- -----------------------------------------------------
IF OBJECT_ID('Envio', 'U') IS NOT NULL
DROP TABLE Envio;
  

CREATE TABLE  Envio (
  id_Envio				  INT NOT NULL,
  id_remito_intersucursal INT NULL,
  ID_EmpresaSubcontratada INT NULL,
  Estado				  VARCHAR(45) NULL,
  Fecha					  DATETIME NULL,
  Id_vehiculo			  INT NULL,
  PRIMARY KEY (id_Envio),
  FOREIGN KEY (ID_EmpresaSubcontratada) REFERENCES EmpresaSubcontratada (ID_EmpresaSubcontratada))


-- -----------------------------------------------------
-- Table RemitoIntersucursal
-- -----------------------------------------------------
IF OBJECT_ID('RemitoIntersucursal', 'U') IS NOT NULL
DROP TABLE RemitoIntersucursal;
  

CREATE TABLE  RemitoIntersucursal (
  id_RemitoIntersucursal INT NOT NULL,
  Id_SucursalOrigen		 INT NULL,
  Id_SucursalDestino     INT NULL,
  ID_Vehiculo		     INT NULL,
  FechaSalida		     DATETIME NULL,
  FechaLlegada		     DATETIME NULL,
  RemitoIntersucursalcol VARCHAR(45) NULL,
  PRIMARY KEY (id_RemitoIntersucursal))
    

-- -----------------------------------------------------
-- Table PaqueteEnvio
-- -----------------------------------------------------
IF OBJECT_ID('PaqueteEnvio', 'U') IS NOT NULL
DROP TABLE PaqueteEnvio;
  

CREATE TABLE  PaqueteEnvio (
  id_Paquete	INT NOT NULL,
  id_Envio		INT NOT NULL,
  PRIMARY KEY (id_Paquete, id_Envio),
  CONSTRAINT fk_Paquete_has_Envio_Paquete1
    FOREIGN KEY (id_Paquete)   REFERENCES Paquete (id_Paquete),
  CONSTRAINT fk_Paquete_has_Envio_Envio1
    FOREIGN KEY (id_Envio)     REFERENCES Envio (id_Envio))
  
  


-- -----------------------------------------------------
-- Table PaqueteRemitoIntersucursal
-- -----------------------------------------------------
IF OBJECT_ID('PaqueteRemitoIntersucursal', 'U') IS NOT NULL
DROP TABLE PaqueteRemitoIntersucursal;
  

CREATE TABLE  PaqueteRemitoIntersucursal (
  id_Paquete			 INT NOT NULL,
  id_RemitoIntersucursal INT NOT NULL,
  PRIMARY KEY (id_Paquete,id_RemitoIntersucursal),
  FOREIGN KEY (id_Paquete)				  REFERENCES Paquete (id_Paquete),
  FOREIGN KEY (id_RemitoIntersucursal)    REFERENCES RemitoIntersucursal (id_RemitoIntersucursal))
  

-- -----------------------------------------------------
-- Table TrackingRemitoIntersucursal
-- -----------------------------------------------------
 
/*
  CREATE TABLE  TrackingRemitoIntersucursal (
  id_Tracking			 INT NOT NULL,
  Id_Remitointersucursal INT NOT NULL,
  PRIMARY KEY (id_Tracking, Id_Remitointersucursal),
  FOREIGN KEY (id_Tracking)			   REFERENCES Tracking (id_Tracking),
  FOREIGN KEY (Id_Remitointersucursal) REFERENCES RemitoIntersucursal (id_RemitoIntersucursal))
 */

IF OBJECT_ID('Tracking', 'U') IS NOT NULL
DROP TABLE Tracking;
 

CREATE TABLE  Tracking (
  id_Tracking	INT NOT NULL,
  Id_Remito		INT NOT NULL,
  id_Manifiesto	INT NOT NULL,
  id_vehiculo	INT NOT NULL,
  PRIMARY KEY (id_Tracking, Id_Remito, id_Manifiesto),
  CONSTRAINT fk_Tracking_Remito1
    FOREIGN KEY (Id_Remito , id_Manifiesto)  REFERENCES Remito (Id_Remito , id_Manifiesto ),
	FOREIGN KEY (id_vehiculo)  REFERENCES Vehiculo (id_vehiculo))
  

IF OBJECT_ID('TrackingRemitoIntersucursal', 'U') IS NOT NULL
DROP TABLE TrackingRemitoIntersucursal;

  CREATE TABLE  TrackingRemitoIntersucursal (
  id_Tracking	INT NOT NULL,
  Id_Remito		INT NOT NULL,
  id_Manifiesto	INT NOT NULL,
  Id_Remitointersucursal INT NOT NULL,
  PRIMARY KEY (id_Tracking,Id_Remito,id_Manifiesto,  Id_Remitointersucursal ),
  FOREIGN KEY (id_Tracking,Id_Remito,id_Manifiesto) REFERENCES Tracking (id_Tracking,Id_Remito,id_Manifiesto),
  FOREIGN KEY (Id_Remitointersucursal)				REFERENCES RemitoIntersucursal (id_RemitoIntersucursal))

-- -----------------------------------------------------
-- Table Ruta
-- -----------------------------------------------------
IF OBJECT_ID('Ruta', 'U') IS NOT NULL
DROP TABLE Ruta;
  

CREATE TABLE  Ruta (
  id_Ruta	INT NOT NULL,
  Origen	VARCHAR(45) NULL,
  Destino	VARCHAR(45) NULL,
  Duracion	VARCHAR(45) NULL,
  Camino	VARCHAR(45) NULL,
  Distancia FLOAT NULL,
  PRIMARY KEY (id_Ruta))
  


-- -----------------------------------------------------
-- Table SucursalRuta
-- -----------------------------------------------------
IF OBJECT_ID('SucursalRuta', 'U') IS NOT NULL
DROP TABLE SucursalRuta;
  

CREATE TABLE  SucursalRuta (
  id_Sucursal	INT NOT NULL,
  id_Ruta		INT NOT NULL,
  PRIMARY KEY (id_Sucursal, id_Ruta),
  FOREIGN KEY (id_Sucursal) REFERENCES Sucursal (id_Sucursal),
  FOREIGN KEY (id_Ruta)     REFERENCES Ruta (id_Ruta))
  
-- -----------------------------------------------------
-- Table Historico
-- -----------------------------------------------------
IF OBJECT_ID('Historico', 'U') IS NOT NULL
DROP TABLE Historico;
 

CREATE TABLE  Historico (
  id_Historico	INT NOT NULL,
  id_vehiculo	INT NULL,
  Fecha			DATETIME NULL,
  Descripcion	VARCHAR(45) NULL,
  Vehiculo_id_Vehiculo INT NOT NULL,
  PRIMARY KEY (id_Historico, Vehiculo_id_Vehiculo),
  FOREIGN KEY (Vehiculo_id_Vehiculo)  REFERENCES Vehiculo (id_Vehiculo))
  

-- -----------------------------------------------------
-- Table TareasMantenimiento
-- -----------------------------------------------------
IF OBJECT_ID('TareasMantenimiento', 'U') IS NOT NULL
DROP TABLE TareasMantenimiento;
 

CREATE TABLE  TareasMantenimiento (
  id_TareasMantenimiento INT NOT NULL,
  descripcion			 VARCHAR(45) NULL,
  Tiempo				 INT NULL,
  PRIMARY KEY (id_TareasMantenimiento))
  


-- -----------------------------------------------------
-- Table PlanDeMantenimientoTareasMantenimiento
-- -----------------------------------------------------
IF OBJECT_ID('PlanTareasMantenimiento', 'U') IS NOT NULL
DROP TABLE PlanTareasMantenimiento;
  

CREATE TABLE  PlanTareasMantenimiento (
  id_PlanDeMantenimiento INT NOT NULL,
  id_TareasMantenimiento INT NOT NULL,
  PRIMARY KEY (id_PlanDeMantenimiento, id_TareasMantenimiento),
  FOREIGN KEY (id_PlanDeMantenimiento) REFERENCES PlanDeMantenimiento (id_PlanDeMantenimiento),
  FOREIGN KEY (id_TareasMantenimiento) REFERENCES TareasMantenimiento (id_TareasMantenimiento))

  



-- -----------------------------------------------------
-- Table PaqueteDestinatario
-- -----------------------------------------------------
 
/*
CREATE TABLE  PaqueteDestinatario (
  id_Paquete			 INT NOT NULL,
  id_RemitoIntersucursal INT NOT NULL,
  id_Destinatario		 INT NOT NULL,
  PRIMARY KEY (id_Paquete, id_RemitoIntersucursal, id_Destinatario),
  FOREIGN KEY (id_Paquete , id_RemitoIntersucursal)  REFERENCES Paquete (id_Paquete)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY ( id_RemitoIntersucursal)
    REFERENCES RemitoIntersucursal (id_RemitoIntersucursal)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (id_Destinatario)
    REFERENCES Destinatario (id_Destinatario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION   )
  */
IF OBJECT_ID('PaqueteDestinatario', 'U') IS NOT NULL
DROP TABLE PaqueteDestinatario;
    
CREATE TABLE  PaqueteDestinatario (
	id_Paquete			 INT NOT NULL,
    id_Destinatario		 INT NOT NULL,
  PRIMARY KEY (id_Paquete, id_Destinatario),
  FOREIGN KEY (id_Paquete)			REFERENCES Paquete (id_Paquete),
  FOREIGN KEY (id_Destinatario)		REFERENCES Destinatario (id_Destinatario))

go