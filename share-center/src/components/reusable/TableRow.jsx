import React from 'react';
import styled from 'styled-components';
import TableData from './TableData';

const StyledTableRow = styled.tr`
    :nth-child(odd) {
    background-color: #eeeeee;
  };
  background-color: ${props => props.header ? '#bbbbbb !important' : ''};
  font-family: Verdana;
  text-transform: capitalize;
  color: ${props => props.header ? '#ffffff': ''}
`

const TableRow = props => {
    const { item, header } = props;
    const spreadItem = 
        header ? Object.keys(item).map((key) =>  <TableData header>{key}</TableData>) 
        : Object.keys(item).map((value) =>  <TableData>{item[value]}</TableData>);
    return <StyledTableRow header={header} id={item.key}>
        {spreadItem}
       </StyledTableRow>
}

export default TableRow;