-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Ago-2022 às 04:52
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bdfarmacia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbentrada`
--

CREATE TABLE `tbentrada` (
  `codigoentrada` int(11) NOT NULL,
  `codigoproduto` int(11) NOT NULL,
  `codigofornecedor` int(11) NOT NULL,
  `datacompra` varchar(30) NOT NULL,
  `item` varchar(40) NOT NULL,
  `empresa` varchar(40) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `custounitario` decimal(7,2) NOT NULL,
  `valorcompratotal` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbentrada`
--

INSERT INTO `tbentrada` (`codigoentrada`, `codigoproduto`, `codigofornecedor`, `datacompra`, `item`, `empresa`, `quantidade`, `custounitario`, `valorcompratotal`) VALUES
(2, 21, 22, '20/02/2021', 'Luftal', 'extrafarma', 20, '10.99', '219.80'),
(4, 21, 22, '20/02/2020', 'Luftal', 'extrafarma', 25, '10.99', '274.75'),
(5, 22, 22, '20/02/2021', 'Dipirona', 'extrafarma', 50, '9.00', '450.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbestoque`
--

CREATE TABLE `tbestoque` (
  `codigoestoque` int(11) NOT NULL,
  `codigoproduto` int(11) NOT NULL,
  `codigofornecedor` int(11) NOT NULL,
  `codigoloja` int(11) NOT NULL,
  `codigoentrada` int(11) NOT NULL,
  `codigosaida` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfornecedor`
--

CREATE TABLE `tbfornecedor` (
  `codigofornecedor` int(11) NOT NULL,
  `empresa` varchar(40) NOT NULL,
  `telefone` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `endereco` varchar(60) NOT NULL,
  `totalcomprado` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbfornecedor`
--

INSERT INTO `tbfornecedor` (`codigofornecedor`, `empresa`, `telefone`, `email`, `endereco`, `totalcomprado`) VALUES
(1, 'Drogasil12', '3294-0001', 'drogasil@gmail.com', 'Rua Antonios Sales, n18', '4000.00'),
(22, 'extrafarma', '(85)98856-4844', 'extra@gmail.com', 'rua antonio sales, nº204', '12000.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblogin`
--

CREATE TABLE `tblogin` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(40) NOT NULL,
  `senha` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tblogin`
--

INSERT INTO `tblogin` (`id_usuario`, `usuario`, `senha`) VALUES
(1, 'adm', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbloja`
--

CREATE TABLE `tbloja` (
  `codigoloja` int(11) NOT NULL,
  `loja` varchar(40) NOT NULL,
  `telefone` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `totalvendido` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbloja`
--

INSERT INTO `tbloja` (`codigoloja`, `loja`, `telefone`, `email`, `endereco`, `totalvendido`) VALUES
(1, 'NewFarm123', '3294-1234', 'newfarm@gmail.com', 'Avenida i 2776', '8579.99');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE `tbproduto` (
  `codigoproduto` int(11) NOT NULL,
  `item` varchar(40) NOT NULL,
  `unidademedida` varchar(40) NOT NULL,
  `estoqueminimo` int(11) NOT NULL,
  `custounitario` decimal(7,2) NOT NULL,
  `precounitario` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbproduto`
--

INSERT INTO `tbproduto` (`codigoproduto`, `item`, `unidademedida`, `estoqueminimo`, `custounitario`, `precounitario`) VALUES
(21, 'Luftal', 'Caixa', 30, '4.00', '10.00'),
(22, 'Dipirona', 'und', 30, '15.00', '30.00'),
(23, 'Dramim', 'und', 20, '6.00', '15.00'),
(25, 'Pantaprazol', 'Caixa', 20, '13.99', '26.99'),
(26, 'Belara', 'Caixa', 15, '20.00', '50.00'),
(27, 'Hidratante Nivea', 'und', 10, '5.00', '20.00'),
(28, 'Cinegripe', 'Caixa', 10, '3.00', '10.00'),
(29, 'Fralda Pampers', 'Und', 10, '25.00', '40.00'),
(30, 'Protetor Solar Bioré', 'Und', 10, '18.00', '45.00'),
(31, 'Shampoo Jonhsons', 'Und', 10, '9.00', '14.00'),
(32, 'Pomada', 'Und', 20, '15.00', '30.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbsaida`
--

CREATE TABLE `tbsaida` (
  `codigosaida` int(11) NOT NULL,
  `codigoproduto` int(11) NOT NULL,
  `codigoloja` int(11) NOT NULL,
  `datavenda` varchar(30) NOT NULL,
  `item` varchar(40) NOT NULL,
  `loja` varchar(40) NOT NULL,
  `quantidadevendida` int(11) NOT NULL,
  `preçounitario` decimal(7,2) NOT NULL,
  `valorvendatotal` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbsaida`
--

INSERT INTO `tbsaida` (`codigosaida`, `codigoproduto`, `codigoloja`, `datavenda`, `item`, `loja`, `quantidadevendida`, `preçounitario`, `valorvendatotal`) VALUES
(2, 21, 1, '20/08/2022', 'Luftal', 'NewFarm123', 6, '10.99', '65.94'),
(4, 22, 1, '21/08/2022', 'Dipirona', 'NewFarm123', 25, '30.00', '750.00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbentrada`
--
ALTER TABLE `tbentrada`
  ADD PRIMARY KEY (`codigoentrada`),
  ADD KEY `codigoproduto` (`codigoproduto`),
  ADD KEY `codigofornecedor` (`codigofornecedor`);

--
-- Índices para tabela `tbestoque`
--
ALTER TABLE `tbestoque`
  ADD PRIMARY KEY (`codigoestoque`),
  ADD KEY `codigoproduto` (`codigoproduto`),
  ADD KEY `codigofornecedor` (`codigofornecedor`),
  ADD KEY `codigoloja` (`codigoloja`),
  ADD KEY `codigoentrada` (`codigoentrada`),
  ADD KEY `codigosaida` (`codigosaida`);

--
-- Índices para tabela `tbfornecedor`
--
ALTER TABLE `tbfornecedor`
  ADD PRIMARY KEY (`codigofornecedor`);

--
-- Índices para tabela `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Índices para tabela `tbloja`
--
ALTER TABLE `tbloja`
  ADD PRIMARY KEY (`codigoloja`);

--
-- Índices para tabela `tbproduto`
--
ALTER TABLE `tbproduto`
  ADD PRIMARY KEY (`codigoproduto`);

--
-- Índices para tabela `tbsaida`
--
ALTER TABLE `tbsaida`
  ADD PRIMARY KEY (`codigosaida`),
  ADD KEY `codigoproduto` (`codigoproduto`),
  ADD KEY `codigoloja` (`codigoloja`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbentrada`
--
ALTER TABLE `tbentrada`
  MODIFY `codigoentrada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tbestoque`
--
ALTER TABLE `tbestoque`
  MODIFY `codigoestoque` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tblogin`
--
ALTER TABLE `tblogin`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbsaida`
--
ALTER TABLE `tbsaida`
  MODIFY `codigosaida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbentrada`
--
ALTER TABLE `tbentrada`
  ADD CONSTRAINT `tbentrada_ibfk_1` FOREIGN KEY (`codigoproduto`) REFERENCES `tbproduto` (`codigoproduto`),
  ADD CONSTRAINT `tbentrada_ibfk_2` FOREIGN KEY (`codigofornecedor`) REFERENCES `tbfornecedor` (`codigofornecedor`);

--
-- Limitadores para a tabela `tbestoque`
--
ALTER TABLE `tbestoque`
  ADD CONSTRAINT `tbestoque_ibfk_1` FOREIGN KEY (`codigoproduto`) REFERENCES `tbproduto` (`codigoproduto`),
  ADD CONSTRAINT `tbestoque_ibfk_2` FOREIGN KEY (`codigofornecedor`) REFERENCES `tbfornecedor` (`codigofornecedor`),
  ADD CONSTRAINT `tbestoque_ibfk_3` FOREIGN KEY (`codigoloja`) REFERENCES `tbloja` (`codigoloja`),
  ADD CONSTRAINT `tbestoque_ibfk_4` FOREIGN KEY (`codigoentrada`) REFERENCES `tbentrada` (`codigoentrada`),
  ADD CONSTRAINT `tbestoque_ibfk_5` FOREIGN KEY (`codigosaida`) REFERENCES `tbsaida` (`codigosaida`);

--
-- Limitadores para a tabela `tbsaida`
--
ALTER TABLE `tbsaida`
  ADD CONSTRAINT `tbsaida_ibfk_1` FOREIGN KEY (`codigoproduto`) REFERENCES `tbproduto` (`codigoproduto`),
  ADD CONSTRAINT `tbsaida_ibfk_2` FOREIGN KEY (`codigoloja`) REFERENCES `tbloja` (`codigoloja`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
