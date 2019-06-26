import React from 'react';
import TableRow from '../../reusable/TableRow';
import Container from '../../reusable/Container';
import Heading from '../../reusable/Heading';
import Table from '../../reusable/Table';


const ClientListComponent = props => {
    const { clients, handleClick } = props;
    console.log(handleClick);
    const listOfItems = clients ?  clients.map((client, index) => 
    <TableRow item={client} index={index} onClick={handleClick}/>
    ) : '';
    return <Container>
    <Heading h3>Client list</Heading>
    <Table>
      <TableRow header item={clients ? clients[0] !== undefined ? clients[0] : '' : ''} index={-1}/>
      {listOfItems}
    </Table>
  </Container>
}

export default ClientListComponent;