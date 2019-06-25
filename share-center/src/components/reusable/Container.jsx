import styled from 'styled-components'

const Container = styled.div`
    min-width: '518px';
    height: ${props => props.heightStatic ? ('340px !important') : ''}
    display: ${props => props.grid ? 'grid': ''};
    background-color: ${props => props.backgroundWhite ? '#fff' : ''} ;
    padding: ${props => props.small ? '10px'  : '20px'};
    text-align: ${props => props.center ? 'center' : ''}
`

export default Container