import React from 'react';
import styled from 'styled-components';

export const StyledGridContainer = styled.div`
    display: ${props => props.inline ? 'inline-grid' : 'grid'};
    grid-gap: ${props => props.gap || '100px'};
    grid-template-columns: ${props => parseInt(props.columns) === 2 ? 'auto auto' : 'auto'};
    align-items: ${props => props.center ? 'center' : ''}
    min-width:0px;
    grid-auto-flow: row;
    
`
const GridContainer = (props) => {
    const { inline, gap, center, ...children } = props;
    return <StyledGridContainer
               inline={inline}
               gap={gap}
               center={center}
               {...children} />
}

export default GridContainer;