import React, { Component } from "react";
import {
    Route,
    HashRouter
} from "react-router-dom";
import Home from "./Home";
import Container from "./components/reusable/Container";
import Layout from "./components/layout/Layout";
import ClientListContainer from "./components/client/show/ClientListContainer";
import ClientContainer from "./components/client/create/ClientContainer"
import InventoryContainer from "./components/inventory/create/InventoryContainer";
class Main extends Component {
    render() {
        return (
            <HashRouter>
                <Layout>
                    <Container fullVertical backgroundWhite heightStatic>
                        <Route exact path="/" component={Home}/>
                        <Route path="/clientList" component={ClientListContainer}/>
                        <Route path="/inventory/:clientId" component={InventoryContainer}/>
                        <Route path="/share" component={ClientContainer}/>
                    </Container>
                </Layout>
            </HashRouter>
        )
    }
}

export default Main;